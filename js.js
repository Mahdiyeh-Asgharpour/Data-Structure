var n = prompt("n:");

for (let i = n; i >= 1; i--) {
    const divs = document.getElementById("a");
    divs.innerHTML += `<span style='border:10px solid white; border-radius:50px; background-color:white; color:black;
   '>${i}</span> <br><br>`;
}
var A, B, C;
var m = 2 * n;

function AtoC() {
    const removea = document.getElementById("a");
    setTimeout(removea.style.opacity = 0, 2000);
    removea.style.opacity = 0;
    const addc = document.getElementById("c");
    addc.innerHTML = removea;
    setTimeout(addc.style.opacity = 1, 2000);

    removea.remove();

}

function BtoC() {
    const removea = document.getElementById("b");
    setTimeout(removea.style.opacity = 0, 2000);
    removea.style.opacity = 0;
    const addc = document.getElementById("c");
    addc.innerHTML = removea;
    setTimeout(addc.style.opacity = 1, 2000);

    removea.remove();

}

function Hanoi(A, B, C, n) {
    if (n == 1)
        AtoC();
    else {
        Hanoi(A, C, B, n - 1)
        AtoC();
        Hanoi(B, A, C, n - 1)


    }

}

function Ex_Hanoi(A, B, C, n) {
    if (n == 1) {
        AtoC();
        BtoC();
    } else {
        Ex_Hanoi(A, B, C, n - 1)

        Hanoi(C, A, B, m - 2)
        AtoC();
        Hanoi(B, A, C, m - 1)

    }
}