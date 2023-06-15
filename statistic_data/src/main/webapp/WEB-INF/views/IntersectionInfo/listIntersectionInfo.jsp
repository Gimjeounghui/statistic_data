<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

	<style type="text/css">
	
		.styled-table	{
			border-collapse: collapse;
		    margin: 25px 0;
		    font-size: 0.9em;
		    font-family: sans-serif;
		    min-width: 400px;
		    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
		}

		.styled-table thead tr {
		    background-color: #009879;
		    color: #ffffff;
		    text-align: left;
	   	}
	
		.styled-table th,
		.styled-table td {
    		padding: 12px 15px;
		}

		.styled-table tbody tr {
    		border-bottom: 1px solid #dddddd;
		}

		.styled-table tbody tr:nth-of-type(even) {
    		background-color: #f3f3f3;
		}

		.styled-table tbody tr:last-of-type {
    		border-bottom: 2px solid #009879;

		.styled-table tbody tr.active-row {
    		font-weight: bold;
    		color: #009879;
		}

	</style>
	
	<script type="text/javascript"></script>
	
	<body>
	
		<table class="styled-table">
		    <thead>
		        <tr>
		            <th>교차로 번호</th>
		            <th>교차로 아이디</th>
		            <th>시작 위도</th>
		            <th>종료 위도</th>
		            <th>시작 경도</th>
		            <th>종료 경도</th>
		        </tr>
		    </thead>
		    <tbody>
			    <c:if test="${fn:length(listIntersect) == 0}">
					<td align="center" colspan="6">조회된 항목이없습니다.</td>
				</c:if>

				<c:forEach var="list" items="${listIntersect}">
	
					<td>${list.intrsctnNo}</td>
					<td>${list.intrsctnId}</td>
					<td>${list.startLatitude}</td>
					<td>${list.endLatitude}</td>
					<td>${list.startLongitude}</td>
					<td>${list.endLongitude}</td>
	
				</c:forEach>		
		    
		    
		        <tr class="active-row">
		            
    		    	<c:if test="${fn:length(listIntersect) == 0}">
						<td align="center" colspan="6">조회된 항목이없습니다.</td>
					</c:if>

					<c:forEach var="list" items="${listIntersect}">
	
						<td>${list.intrsctnNo}</td>
						<td>${list.intrsctnId}</td>
						<td>${list.startLatitude}</td>
						<td>${list.endLatitude}</td>
						<td>${list.startLongitude}</td>
						<td>${list.endLongitude}</td>
		
					</c:forEach>		
		        </tr>
		    </tbody>
		</table>
	</body>