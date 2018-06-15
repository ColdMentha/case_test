package main

import (
	"fmt"
	"encoding/json"
)

func test() int {
	
	var a, b int = 0, 1
	var c int = 10

	var mas[] int
		for c!=0{
			a=a+b
			b=a-b
			c=c-1
			mas = append(mas, a)
		}

	var k int


	for i:=0;i < len(mas);i++ {
		intB,_:=json.Marshal(i)
		fmt.Print("Enter number ",i+1,":")
		fmt.Scan(&k)
		if k!=mas[i] {
			fmt.Println("Правильный число:", mas[i], " - порядковый номер ", string(intB))
			
		}

	}
	return 0
}

func main() {

	test()
}
