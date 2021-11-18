<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>员工列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="${ctx}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
    <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>员工列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="${ctx }/employee/list" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row" style="" align="center">
        <form class="layui-form layui-col-md12 x-so" method="get" action="${ctx }/employee/list">
          <input type="text" name="content" style="width:50%;"  placeholder="请输入查找员工姓名" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <table class="layui-table">
        <thead>
          <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
         <th>手机号码</th>
         <th>邮箱</th>
         <th>职位</th>
         <th>学历</th>
         <th>身份证号码</th>
         <th>部门</th>
         <th>联系地址</th>
         <th>工资</th>
         <!-- <th>状态</th> -->
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.list}" var="dept" varStatus="stat">
     <tr>
            <td>${dept.name }</td>
            <td>
             <c:choose>
					        	<c:when test="${dept.sex == 1 }">男</c:when>
					        	<c:otherwise>女</c:otherwise>
					  </c:choose>
           
            </td>
            <td>${dept.age }</td>
            <td>${dept.phone }</td>
            <td>${dept.email }</td>
            <td>${dept.job.name }</td>
            <td>${dept.education }</td>
            <td>${dept.card_id }</td>
            <td>${dept.dept.name }</td>
            <td>${dept.address }</td>
            <td>${dept.salary }</td>
               <c:choose>
			<c:when test="${sessionScope.tip  == 1 }">
					        	 <td class="td-manage">
              <a title="编辑"  href="${ctx}/employee/add?id=${dept.id }">
                <i class="layui-icon">&#xe642;</i>
              </a>
              <a title="删除" onclick="member_del(this,'${dept.id }')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
			</c:when>      
					  </c:choose>
           
          </tr>
			</c:forEach> 
        </tbody>
      </table>
    </div>
    <script>

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              //等以后再使用异步，这里先使用
              $.get("${ctx}/employee/delete?id="+id);
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }
    </script>
  </body>

</html>