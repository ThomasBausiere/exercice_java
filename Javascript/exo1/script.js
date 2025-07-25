let score = [40, 50, 64, 23, 100];
const len = score.length;

function afficherScore(score){
    console.table(score)
}
afficherScore(score);

function moyenneScore(score){
    let sum = 0;
    let avg;
    for(let i = 0; i < len - 1; i ++){
        sum = sum + score[i];
    }
    avg = sum/len;
    console.log("Moyenne :"+ avg);
}
moyenneScore(score);

function meilleurScore(score){
    let record = 0 ;
        for(let i = 0; i < len - 1; i++){
            if( record < score[i]){
                record = score[i]
            }
    }
    console.log("Meilleur score: "+record)
}
meilleurScore(score);

function mention(score){

        for(let i = 0; i < len - 1; i++){      
            if (score[i] >= 0 && score[i] < 50){
                console.log(score[i] + "Insufisant");            
            }

            else if (score[i] >= 50 && score[i] < 65){
                console.log(score[i] + "Passable");         

            }

            else if (score[i] >= 65 && score[i] < 80){

                console.log(score[i] + "Bien");            
            }

            else if (score[i] >= 80 && score[i] < 90){

                console.log(score[i] + "Tres bien");            
            }

            else if (score[i] >= 90 && score[i] <= 100){

                console.log(score[i] + "Excellent");            
            }

        }
    }



mention(score);





