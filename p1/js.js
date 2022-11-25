const n = prompt("n:");
const m = 3 * n;
var myInterval, time;
const rods = {
    A: document.getElementById("a"),
    B: document.getElementById("b"),
    C: document.getElementById("c"),
};
var move = [];
const A1 = [],
    B1 = [],
    C1 = [];

for (let i = m - 1; i >= 0; i--) {
    const disk = document.createElement("span");

    if (i < 10) {
        disk.style.paddingLeft = Number(m - i);
        disk.style.paddingRight = Number(m - i);
    } else {
        disk.style.paddingLeft = Number(m - i - 5);
        disk.style.paddingRight = Number(m - i - 5);
    }

    if (i % 3 == 2) {
        const text = document.createTextNode(`${m - i}`);
        disk.classList.add("a");
        disk.appendChild(text);

        A1.push(disk);
    } else if (i % 3 == 1) {
        const text = document.createTextNode(`${m - i}`);
        disk.classList.add("b");
        disk.appendChild(text);

        B1.push(disk);
    } else {
        const text = document.createTextNode(`${m - i}`);
        disk.classList.add("c");
        disk.appendChild(text);

        C1.push(disk);
    }
}
for (let i = n - 1; i >= 0; i--) {
    rods["A"].appendChild(A1[i]);
    rods["B"].appendChild(B1[i]);
    rods["C"].appendChild(C1[i]);
}

document.body.addEventListener("click", Ex_Hanoi("A", "B", "C", n));

function timer(q) {
    const inp = document.getElementById("input1");

    if (q == 0) {
        time = prompt("time limit:");
        inp.innerHTML = ` <input id="Stop" onclick="stop()" type="button" value="Stop">
    <input id="Continue" type="button" value="Continue">
    <input id="From-the-beginning" onclick="reload()" type="button" value="From the beginning">
    <input id="At-the-end" onclick="end()" type="button" value="At the end">`;

        starting();
    } else if (q == 1)
        inp.innerHTML = `<input id="Click" onclick="Continue()" type="button" value="Click"> `;
}

function starting() {
    const myInterval = setInterval(() => {
        if (move.length === 0) {
            document.getElementById("Stop").addEventListener("click", () => {
                clearInterval(myInterval);
            });
            return;
        }
        const [from, to] = move.shift();
        moves(from, to);
    }, time * 1000);

    document.getElementById("Stop").addEventListener("click", () => {
        clearInterval(myInterval);
    });

    document.getElementById("Continue").addEventListener("click", () => {
        starting();
    });
}

function Continue() {
    const [from, to] = move.shift();
    moves(from, to);
}

function reload() {
    document.addEventListener("click", location.reload());
}

function end() {
    document.getElementById("a").remove();
    document.getElementById("b").remove();
    document.getElementById("c").innerHTML = `<div></div>`;
    for (let j = m; j > 0; j--) {
        document.getElementById(
            "c"
        ).innerHTML += `<span id='box-${j}' style=' padding-right:${Number(
      m - j
    )}px; padding-left:${Number(m - j)}px;'>${Number(j)}</span> <br>`;
        if (j >= 10) {
            document.getElementById(`box-${j}`).style.paddingRight = Number(
                m - j - 5
            );
            document.getElementById(`box-${j}`).style.paddingLeft = Number(m - j - 5);
        }
    }
}

function moves(from, to) {
    const fromEL = rods[from];
    const toEL = rods[to];
    const disk = fromEL.firstChild;
    toEL.insertBefore(disk, toEL.firstChild);
}

function Hanoi(A, B, C, n) {
    if (n == 1) {
        move.push([A, C]);
        return;
    } else {
        Hanoi(A, C, B, n - 1);
        move.push([A, C]);
        Hanoi(B, A, C, n - 1);
    }
}

function Ex_Hanoi(A, B, C, n) {
    if (n == 1) {
        move.push([C, B]);
        move.push([A, C]);
        move.push([B, A]);
        move.push([B, C]);
        move.push([A, C]);
        return;
    } else {
        Ex_Hanoi(A, B, C, n - 1);
        Hanoi(C, A, B, 3 * n - 2);
        move.push([A, C]);
        Hanoi(B, A, C, 3 * n - 1);
    }
}