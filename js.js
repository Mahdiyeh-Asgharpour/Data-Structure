const n = prompt("n:");
const A = [];
const B = [];
const C = [];
const m = 2 * n;
document.body.addEventListener("keypress", Ex_Hanoi);

for (let i = 0; i < n; i++) {
    const divs = document.getElementById("a");
    const a = divs.innerHTML += `<span style='border:10px solid white; border-radius:50px; background-color:white; color:black;
   '>${n-i}</span> <br><br>`;
    A[i] = a;
}

function timer(elementId) {
    const inp = document.getElementById(elementId);
    inp.remove();
    inp.innerHTML = `<input id="Click" type="button" value="Click"> `;


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