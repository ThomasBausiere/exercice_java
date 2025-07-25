const scores= [25, 51, 100, 78, 91];
const len = scores.length;
let excellentTableau = [];
let moyenTableau = [];
let insuffisantTableau = [];
let newArray = [];

function estExcellent(score){
    
    
    if(score >= 90){
        console.log("filtre excellent");
        return true;
    }
}
function estMoyen(score){
        if(score >= 50 && score < 80){
        console.log("filtre moyen");
        return true;
    }
}
function estInsuffisant(score){
        if(score < 50){
        return true;
    }
}
function filtreScores(Array, callback){
    for(let i = 0; i <= len -1; i++){
        if(callback(Array[i])){
            console.log("filtre insuffisant");
            newArray.push(Array[i])
        }
    }
}



filtreScores(scores, estExcellent);
console.table(newArray)