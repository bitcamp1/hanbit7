<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	#guest_edit_tab tr td{border:1px solid gray;}
</style>
	<form name="guest_form"  >
	<table id='guest_edit_tab'  style='width:50%;border:1px solid gray;padding: 50px;margin:0 auto;border-collapse: collapse;'>
		<tr>
			<td><b>글번호:</b>	</td>
			<td><input type=text name="guestNo" onFocus="message()" value='${guest.guestNo}' readonly="readonly"> </td>
		</tr>
		<tr>
			<td><b>수정이름:</b></td>
			<td><input type=text name="name" value='${guest.name}'> <br></td>
		</tr>
		<tr>
			<td><b>수정제목:</b></td>
			<td><input type=text name="title" value='${guest.title}'> <br></td>
		</tr>
		<tr>
			<td><b>수정급여:</b></td>
			<td><input type=text name="readHit" value='${guest.readHit}'> <p>
			</td>
			
		</tr>
		<tr>
			<td colspan="2" style='text-align: center;'>
				<input type="button" value="수정" onclick="popup('update')"> 
				<input type="hidden" name="${guest.guestNo }" />
				<input type="button" value="삭제" value='confirm' onclick="popup('delete')" />
				<input type="reset"  value="취소">	
			</td>
		</tr>
	
	</table>
		
	</form>
 <p>
	<script type="text/javascript">
	   function move(){
		   myform.submit();
	   }
	   var theForm = document.guest_form;
	   function popup(message){
		   if(message=='update'){
			 
				theForm.method = 'post';
				theForm.action = 'update.do';
				theForm.submit();
		   }else if(message=='delete'){
			   var message = "정말  삭제하시겠습니까?";
				var result = confirm(message);
				theForm.method = 'get';
				theForm.action = 'delete.do';
				theForm.submit();
		   }
			
			
		}
	</script>