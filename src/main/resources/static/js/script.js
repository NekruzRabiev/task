function select_change() {
	var z = document.getElementById("form_action").selectedIndex;
	var z1 = document.getElementsByTagName("option")[z].value;
}
function myfunction() {
	if (validation()) {
		var x = document.getElementById("form_action").selectedIndex;
		var action = document.getElementsByTagName("option")[x].value;
		if (action !== "") {
			document.getElementById("form_id").action = action;
			document.getElementById("form_id").submit();
		} else {
			alert("Please set form action");
		}
	}
}

function validation() {
	var keyword = document.getElementById("keyword").value;
	if (keyword === '') {
		alert("Please fill out the field...!!!!!!");
		return false;
	} else {
		return true;
	}
}