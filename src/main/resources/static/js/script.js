function dynamicUrl() {

	var x = document.getElementById("form_action").selectedIndex;
	var action = document.getElementsByTagName("option")[x].value;

	if (action !== "") {
		document.getElementById("form_id").action = action;
		document.getElementById("form_id").submit();
	} else {
		alert("Please set filter");
	}
}

function pressEnter(event) {
	if (event.key === "Enter") {
		document.getElementById("btnClick").click();
		return false;
	}
	return true;
}
