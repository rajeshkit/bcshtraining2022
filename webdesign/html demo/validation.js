var userNameRegex = /^[a-zA-Z ]+$/;  
var emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
var phoneRegex = /^[9876]{1}[0-9]{9}$/
var passRegex = /^[a-zA-Z@_]{8,16}$/
function validate(){
    //alert('event handler validate method invoked');
  var username = document.rf.uname.value;
  var userEmail = document.rf.uemail.value;
  var userPhone = document.rf.uphone.value;
  var userPass = document.rf.upass.value;
  var userGender = document.rf.ugender.value;

  var int1=document.rf.uinterest[0].checked;
  var int2=document.rf.uinterest[1].checked;
  var int3=document.rf.uinterest[2].checked;
  var userCity = document.rf.ucity.value;
  if(username==""){
      alert('name cannot be empty');
      return false;
  }
  if(userNameRegex.test(username)==false){
      alert('name should not numbers and special character');
      return false;
  }
  if(userEmail==""){
      alert('Email cannot be empty');
      return false;
  }
  if(emailRegex.test(userEmail)==false){
      alert('Email format is wrong!! check your email');
      return false;
  }
  if(userPhone==""){
      alert('Phone number cannot be empty');
      return false;
  }
  if(phoneRegex.test(userPhone)==false){
      alert('wrong phone number!! check contact number');
      return false;
  }
  if(userPass==""){
      alert('user password cannot be empty');
  }
  if(passRegex.test(userPass)==false){
      alert('password should be min 8 char max 16 characters.it allows @_')
  }
  if(userGender==""){
      alert('select Gender');
      return false;
  }
  if(int1==false&&int2==false&&int3==false){
      alert('choose at least one product');
      return false;
  }
  if(userCity==""){
      alert('Select city');
      return false;
  }
  return true;
}