<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<%
	// ���� ����
    session.invalidate();

    if( application.getAttribute("admincount") != null) {
		Integer rm1 = (Integer)application.getAttribute("admincount");
		int s = rm1.intValue(); 
		Integer rm2 = new Integer(--s);
    	application.setAttribute("admincount",rm2);
	}				
%>
<script language="javascript">
    alert('�α׾ƿ� �Ǿ����ϴ�.');
    location.href="../main/index.jsp";
</script>    