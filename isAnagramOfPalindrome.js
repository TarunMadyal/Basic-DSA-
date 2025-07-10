function isAnagramOfPalindrome(str) {
  let charCount ={};
   
   for (let char of str){
       if(char == " ") continue;
       charCount[char] = (charCount[char] || 0)+1;
   }
   
   let oddCount = 0;
   for(let char in charCount){
       if (charCount[char] % 2 !== 0){
           oddCount++;
       }
   }
   
   if(oddCount <= 1){
       console.log("Given string can be rearranged into a Palindrome");}
       else{
           console.log("Given string cannot be rearranged into a Palindrome");
       }
   }
isAnagramOfPalindrome("Tarun")
