$("#temp").click(function temp(){
    let monthName = document.getElementById("month").value;
    let month = parseMonth(monthName);

    if(month == -1) {
        alert("Ugyldig måned");
        return;
    }
    let url = "temp?month=" + month


/*  Eksempel på hvordan man kan bruke fetch til å hente data fra serveren
    Dette er ikke pensum, men kan være nyttig å vite om til senere
    fetch(url, {
        method: "GET"
    })
        .then(response => response.text())
        .then(data => {
            let temp = "Temperaturen i " + monthName.toLowerCase() + " er " + data + " grader C.";

            document.getElementById("result").innerHTML = temp;
        })

*/
    //Henter temperatur fra serveren ved å bruke jquery
    $.get(url, function(data){
        let temp = "Temperaturen i " + monthName.toLowerCase() + " er " + data + " grader C."

        $("#result").html(temp);
    })

})
// Funksjon som endrer månedenavn til månedsnummer
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