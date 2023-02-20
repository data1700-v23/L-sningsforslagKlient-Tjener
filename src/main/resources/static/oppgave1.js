$("#temp").click(function temp(){
    let monthName = document.getElementById("month").value;
    let month = parseMonth(monthName);

    if(month == -1) {
        alert("Ugyldig måned");
        return;
    }
    let url = "temp?month=" + month


/*  Example of how to use fetch instead of jQuery
    This is not part of the course, but it could be useful to know

    fetch(url, {
        method: "GET"
    })
        .then(response => response.text())
        .then(data => {
            let temp = "Temperaturen i " + monthName.toLowerCase() + " er " + data + " grader C.";

            document.getElementById("result").innerHTML = temp;
        })

*/
    //Gets the temperature from the server using jQuery get
    $.get(url, function(data){
        let temp = "Temperaturen i " + monthName.toLowerCase() + " er " + data + " grader C."

        document.getElementById("result").innerHTML = temp;
    })

})
// Function to parse the month number from input
function parseMonth(monthName){
    let month = monthName.toLowerCase();
    switch(month){
        case "januar":
            return 1;
        case "februar":
            return 2;
        case "mars":
            return 3;
        case "april":
            return 4;
        case "mai":
            return 5;
        case "juni":
            return 6;
        case "juli":
            return 7;
        case "august":
            return 8;
        case "september":
            return 9;
        case "october":
            return 10;
        case "november":
            return 11;
        case "december":
            return 12;
        default:
            return -1;  // Error
    }
}