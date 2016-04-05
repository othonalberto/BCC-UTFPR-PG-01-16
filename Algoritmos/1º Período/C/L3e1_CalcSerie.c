#include <stdio.h>

int main(){
	int x;
	float a, s = 1;

	for (x = 2; x < 11; x++){
		if(x%2 == 0){
			a = x;
			s -= (a / (a*a));
		}else{
			a = x;
			s += (a / (a*a));
		}
	}
	printf("%f", s);
}
