const n = prompt("n:");
const m = 3 * n;
document.body.addEventListener("keypress", Ex_Hanoi);

for (let i = m; i > 0; i--) {
    if (i % 3 == 1) {
        const divsa = document.getElementById("a");
        const a = divsa.innerHTML += `<span id='box-${Number(i)}'>${Number( i)}</span> <br>`;
    } else if (i % 3 == 2) {
        const divsb = document.getElementById("b");
        const b = divsb.innerHTML += `<span id='box-${Number(i)}'>${Number(i)}</span> <br>`;
    } else {
        const divsc = document.getElementById("c");
        const c = divsc.innerHTML += `<span id='box-${Number(i)}' >${Number(i)}</span> <br>`;

    }


}

function timer(q) {
    const inp = document.getElementById("input1");

    if (q == 0) {
        const time = prompt("time limit:");
        inp.innerHTML = ` <input id="Stop" onclick="stop()" type="button" value="Stop">
    <input id="Continue" type="button" value="Continue">
    <input id="From-the-beginning" onclick="reload()" type="button" value="From the beginning">
    <input id="At-the-end" onclick="end()" type="button" value="At the end">`;


    } else if (q == 1)
        inp.innerHTML = `<input id="Click" type="button" value="Click"> `;


}

function reload() {
    document.addEventListener("click", location.reload());


}

function stop() {
    document.addEventListener("click", window.stop());


}

function end() {
    document.getElementById("a").remove();
    document.getElementById("b").remove();
    document.getElementById("c").innerHTML = `<div></div>`;
    for (let j = 0; j < m; j++) {
        document.getElementById("c").innerHTML += `<span>${Number((m) - j)}</span> <br>`;

    }

}



function move(p1, p2) {
    document.getElementById(`${p2}`).innerHTML += document.getElementById(`${p1}`);
    document.getElementById(`${p1}`).remove;


}

function Hanoi(A, B, C, n) {
    if (n == 1) move(a, c);
    else {
        Hanoi(A, C, B, n - 1);
        move(a, c);
        Hanoi(B, A, C, n - 1);
    }
}

function Ex_Hanoi(A, B, C, n) {
    if (n == 1) {
        move(c, b);
        move(a, c);
        move(b, a);
        move(b, c);
        move(a, c);
    } else {
        Ex_Hanoi(A, B, C, n - 1);
        Hanoi(C, A, B, m - 2);
        move(a, c);
        Hanoi(B, A, C, m - 1);
    }
}