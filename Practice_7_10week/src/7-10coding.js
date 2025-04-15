//구구단 만들기
//let date = new Date();
//console.log(`현재 시간은 ${new Date()}입니다.`);
//let mul = 0;
//console.log(`구구단 3단!`);
//for( let i = 0; i<=9; i++ ){
//    mul = 3 * i;
//    console.log(`3 * ${i} = ${mul}`);
//}

//[36, 122, 79, 8, "무궁화", 391, "words", 509, 20192, "B", 321, 473, 73, "france", "Korea", 24, 99]
//
//1. 위 배열을 오름차순으로 정렬해서 출력하세요.
//2. 가장 큰 값을 출력 하세요
//3. 짝수인 요소만 배열로 출력하세요


//// 입력받은 높이의 피라미드 만들기
//let n = prompt("입력");
//let p = " ";
//let q = "*";
//let z = 1;
//for(let i = 0; i < n; i++) {
//    console.log(p.repeat(n-(i+1)) + q.repeat(z) + p.repeat(n-(i+1)));
//    z += 2;
//    }


//// 로또 만들기
////1~45번 까지의 숫자 5개, 보너스 1개를 랜덤으로 만든다.
////숫자 6개가 저장되는 배열을 선언하여 [0, 0, 0, 0, 0, 0] 오름차순으로 정렬한다.
////math.random() * math.ceil() 중복된 숫자는 제거한다.
//let randomPick = [];
//for (let i = 0; i < 6; i++){
//    randomNum = Math.floor(Math.random()*(45-1)+1);
//    if (randomPick.indexOf(randomNum) === -1) {
//        randomPick.push(randomNum);
//    } else {
//        i--;
//    }
//}
//
//console.log(randomPick[0] + ", " + randomPick[1] + ", " + randomPick[2] + ", " + randomPick[3] + ", " + randomPick[4] + "은 랜덤 숫자이고 " + randomPick[5] + "은 보너스입니다.");
//randomPick.sort(function (a, b) {
//    return a-b;
//});
//console.log(randomPick);


//// 게임 캐릭터 클래스 만들기
//class Wizard {
//    health = 0;
//    mana = 0;
//    armor = 0;
//
//    constructor(health, mana, armor){
//        this.health = health;
//        this.mana = mana;
//        this.armor = armor;
//    }
//
//    attack() {
//        console.log("파이어볼");
//    }
//}
//
//let x = new Wizard(545, 210, 10);
//console.log(x.health, x.mana, x.armor);
//x.attack();

////몇 번째 행성인가요?
//let a = prompt("몇번 째 행성이 궁금하신가요?");
//let b = ["수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"];
//console.log(b[a-1]);

////거꾸로 > 로꾸거
//let r = prompt("");
//let newString = "";
//
//for (let i = r.length -1; i >= 0; i--){
//    newString += r[i];
//}
//
//console.log(newString);