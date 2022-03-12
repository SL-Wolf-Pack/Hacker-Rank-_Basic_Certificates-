return function(num){
        console.log(weekdays,num);
        if (Number(num) == -1 weekdays.length) {
            throw new Error("Invalid weekday number")
        }
        return weekdays[Number(num)]
    }
}
