<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%
    String cpath = request.getContextPath(); // /m02
    %>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>BESPOKE CINEMA</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="https://kit.fontawesome.com/3929e16ef5.js" crossorigin="anonymous"></script>
        <script src="{% static 'network/functions.js' %}"></script>
  <style>
      body{
          background-color: black;
      }
 
@import url(https://fonts.googleapis.com/css?family=Open+Sans);

.search {
  width: 50%;
  position: relative;
  display: flex;
  margin-left: 60%;
}

.searchTerm {
  width: 100%;
  border: 3px solid #e9e9e9;
  border-right: none;
  padding: 5px;
  height: 36px;
  border-radius: 5px 0 0 5px;
  outline: none;
  color: #9DBFAF;
}

.searchTerm:focus{
  color: #e9e9e9;
}

.searchButton {
  width: 40px;
  height: 36px;
  border: 1px solid #e9e9e9;
  background: #e9e9e9;
  text-align: center;
  color: black;
  border-radius: 0 5px 5px 0;
  cursor: pointer;
  font-size: 20px;
}
.wrap{
  width: 30%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
/* ---------------------����--------------------------- */
.img-1{
      width:55%;
      height: 50%;
      padding-left:150px;
      position:static;
      left: 80%;
      border-color: black;
      object-fit: cover;
      
      

  }
  img.static { 
        position: static;
      }
  
  
      .poster{
    padding-left:270px;
    font-size: 18px;
  }
 
  ol{
    border-right:1px solid gray;
    width: 1000px;
  }
 #grid{
   display: grid;
   color: white;
   position: absolute;
   bottom: 200px;
   left: 800px;
 }
 #story{
   width: 650px;
   position: absolute;
   left: 800px;
   color: white;
   font-size: 20px;
 }


  </style>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="<%=cpath%>/moviemain.do">BESPOKE CINEMA</a>
    </div>
    <div class="wrap">
      <div class="search">
          
         
          
       
      </div>
   </div>
      <ul class="nav navbar-nav navbar-right">
       
        <li><a href="<%=cpath%>/moviemypage.do">������</a></li>
      <li><a href="<%=cpath%>/moviemycal.do">Ķ����</a></li>
      </ul>
    </div>
  
</nav>
<div class="container-fluid bg-1"></div>
 <div class="img-1">
   <img src="https://file.mk.co.kr/meet/neds/2021/09/image_readtop_2021_931772_16329893494800394.jpg" class="img-1" alt="������">
</div>
 
 <!-- ��Ʃ�� ��ũ -->
 <div>
  <iframe width="650" height="400" src="https://www.youtube.com/embed/BdkSkI61aGo?rel=0&amp;autoplay=1&mute=1&amp;loop=1;playlist=BdkSkI61aGo" 
  frameborder="8" style="position:absolute; left:800px; top:100px; "></iframe>
  </div>
  
  <hr>

<!-- import -->


<!-- ������ �� ����, ��ȭ��� -->
  <table>
    <tr>
      <td class="poster">
        
        <h3 style=" font-size:35px; color: white;">���ͳν�</h3>
        
        <p style="   color: white;">���� : <span><!-- =vo.movie_pos() %> --> �ƹ���</span></p>
        <p style="   color: white;">��� : <span>������������, ������, ������ŵ�</span></p>
        <p style="   color: white;">�󿵽ð� : <span>155��</span></p>
        <p style="   color: white;">�帣: <span>�׼�,���,��Ÿ��</span></p>
        <p style="   color: white;">��������<span>2021.11.03</span></p>
      
      </td>
      <td id="story">
          <h2>�ٰŸ�</h2>
            <p>���� ��Ʃ�����  <���ͳν�> �� �� õ�⿡ ���� �� ����� �巯���� �ʰ� ��ƿ� �Ҹ��� ����ε���  <�����_�������>
             ���� �η��� ���� ������ �� '�������'�� �¼��� ���� �ٽ� ���� ��ġ�鼭 �������� �̾߱�</p>
        </td>
    </tr>
  </table>
 
  <hr>

  <table>
    <tr>
      <td class="poster">
        
        <h3 style=" font-size:35px; color: white;">��ȭ����</h3>
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ81HpW7PCNKisRMTsmPQJDPyrFcKqOMUU63tqO6GHIfkTZAWo7XpXjdXScONVEjuYZz60&usqp=CAU" alt="" style="width: 50px; height: 50px;">
        <p style="color: white;">�� ��ȭ�� �� ~~%�� ����ڵ��� �����̶�� ���߽��ϴ�</p>
      </td>
      <td id="story">
          
            <p>����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1</p>
            <p>����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1</p>
            <p>����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1</p>
            <p>����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1</p>
            <p>����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1</p>
            <p>����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1 ����1</p>

        </td>
    </tr>
  </table> 



</div>



</body>
</html>