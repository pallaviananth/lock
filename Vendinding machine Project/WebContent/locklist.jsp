<%@taglib prefix="display" uri="http://displaytag.sf.net" %>
	<a href="insertlock.htm">Add Lock</a>
	<display:table name="${requestScope.locks}" requestURI="/locklist.htm" list="locks" pagesize="5" decorator="com.cis.ui.decorator.LockDecorator">
		<display:column property="lockID" title="LockID" />
		
		<display:column property="machineNAME"></display:column>
		
		<display:column property="machineSIZE"></display:column>
		
		<display:column property="machinePrice"></display:column>
	<display:column property="delete"></display:column>
		<display:column property="edit"></display:column>
	 
	</display:table> 
