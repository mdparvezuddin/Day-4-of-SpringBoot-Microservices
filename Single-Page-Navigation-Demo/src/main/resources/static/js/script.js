function showContent(section){

const content=document.getElementById("content");

if(section==="A"){

content.innerHTML=`

<h2>Students</h2>

<p>Student Information</p>

`;

}

else if(section==="B"){

content.innerHTML=`

<h2>Teachers</h2>

<p>Teacher Information</p>

`;

}

else if(section==="C"){

content.innerHTML=`

<h2>Attendance</h2>

<p>Attendance Module</p>

`;

}

else{

content.innerHTML=`

<h2>Fees</h2>

<p>Fees Management</p>

`;

}

}