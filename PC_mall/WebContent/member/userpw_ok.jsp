<%@ page import="java.sql.*,oracle.dbpool.*" contentType="text/html;charset=UTF-8" %>

<%@ page import="org.apache.log4j.*" %>
<%! 
   static Logger logger = Logger.getLogger("userpw_ok.jsp"); 
%>

<%
   try{
      DBConnectionManager pool = DBConnectionManager.getInstance();
      Connection con = pool.getConnection("ora8");
      String uid="", email="", name="", pwd="";
      String mem_id = request.getParameter("uid"); 
      String mem_email = request.getParameter("email");
      String sql = "select m_uid, m_name, m_email, m_pwd from member where m_uid ='" + mem_id +"'"; 
      
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      if(rs.next()) {
         
         uid   = rs.getString(1);
         name  = rs.getString(2);
         email = rs.getString(3);
         pwd   = rs.getString(4);
         
      
         
         logger.info("name:"+ name);

         
      } else{
         
         System.out.println("!!!!!!!!! ID 없으니 회원가입");
 %>

         <script language="JavaScript"> 
            alert("아이디가 존재하지 않습니다.");
            history.go(-1);        // 1단계 이전 페이지로 이동
         </script>

 <% }
      System.out.println("!!!!!!!!! ");
      
        if(uid.equals(mem_id) && email.equals(mem_email)) {

         System.out.println("???????");
         logger.info("pw:" + pwd);
%>

         <script type="text/javascript">
            alert("당신의 PW는 " + <%=pwd%> + " 입니다.");
            location.href="../member/login.jsp";      // 로그인페이지로 이동
         </script>
            
<%       
         
       } else if( uid.equals(mem_id) && !email.equals(mem_email)) {
          System.out.println("PW 찾기 실패 -  이메일 오류");
%>

         <script>
            alert("이메일이 일치하지 않습니다");
            history.go(-1); 
         </script>

<%
      }else{
         System.out.println("else");
      }
      stmt.close();                       // stmt 닫기   
      rs.close();                         // rs 닫기
      pool.freeConnection("ora8", con);   // 커넥션 풀 종료
   } catch(Exception e) {
      out.println(e);
   }
   
%>