var n = prompt("n:");
var A, B, C;
var m = 2 * n;

function Hanoi(A, B, C, n) {
    if (n == 1)
        A-- > C
    else {
        Hanoi(A, C, B, n - 1)
        A-- > C
        Hanoi(B, A, C, n - 1)


    }

}

function Ex_Hanoi(A, B, C, n) {
    if (n == 1) {
        A-- > C
        B-- > C
    } else {
        Ex_Hanoi(A, B, C, n - 1)

        Hanoi(C, A, B, m - 2)
        A-- > C
        Hanoi(B, A, C, m - 1)

    }
}