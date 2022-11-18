const n = prompt("n:");
const A = [];
const B = [];
const C = [];
const m = 2 * n;
document.body.addEventListener("keypress", Ex_Hanoi);

for (let i = 0; i < n; i++) {
    const divs = document.getElementById("a");
    const a = divs.innerHTML += `<span style='border:10px solid #FFF7CA; border-radius:100px; color:#F3368D; background-color:#FFF7CA;
   '>${n-i}</span> <br><br>`;
    A[i] = a;
}

function timer(q) {
    const inp = document.getElementById("input1");
    if (q == 0) {
        const time = prompt("time limit:");
        inp.innerHTML = ` <input id="Stop" onclick="stop()" type="button" value="Stop">
    <input id="Continue" type="button" value="Continue">
    <input id="From-the-beginning" onclick="reload()" type="button" value="From the beginning">
    <input id="At-the-end" type="button" value="At the end">`;


    } else if (q == 1)
        inp.innerHTML = `<input id="Click" type="button" value="Click"> `;


}

function reload() {
    document.addEventListener("click", location.reload());


}

function stop() {
    document.addEventListener("click", window.stop());


}



function move(index) {
    if (index == 0) {
        for (let i = 0; i < n; i++) {
            C[i] = A[i];
            A.splice(i, 1);
        }



    } else {
        for (let i = 0; i < n; i++) {
            C[i] = B[i];
            B.splice(i, 1);
        }

    }

}

function Hanoi(A, B, C, n) {
    if (n == 1) move(0);
    else {
        Hanoi(A, C, B, n - 1);
        move(0);
        Hanoi(B, A, C, n - 1);
    }
}

function Ex_Hanoi(A, B, C, n) {
    if (n == 1) {
        move(0);
        move(1);
    } else {
        Ex_Hanoi(A, B, C, n - 1);
        Hanoi(C, A, B, m - 2);
        move(0);
        Hanoi(B, A, C, m - 1);
    }
}