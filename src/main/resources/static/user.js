$(document).ready(function() {
   $.ajax({
       url: "http://localhost:8080/conf/user"
   }).then (function(data) {
       $('.firstname').append(data.firstname);
       $('.lastname').append(data.lastname);
       $('.age').append(data.age);
   });
});