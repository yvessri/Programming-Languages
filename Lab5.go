package main

import (
	"fmt"
	"strings"
)

func main() {
	s1 := "This is the house that Jack built."

	fmt.Println(s1[0:4])                        // This
	fmt.Println(s1[5:7])                        // is
	fmt.Println(strings.Index(s1, "This"))      // 0
	fmt.Println(strings.Index(s1, "J"))         // 21
	fmt.Println(strings.Index(s1[4:], "is")+4)  // 5
	fmt.Println(len(s1))                        // 31
	fmt.Println(s1[5:])                         // is the house that Jack built.
	fmt.Println(len(s1[5:]))                    // 26
}
