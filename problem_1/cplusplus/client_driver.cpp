/*******************************************************************************
*
* File: client_driver.cpp
* Author: W. B. Metzel
* Created: 16 June 2016
* Last Revised: 16 June 2016
* Description: The main program for Project Euler - problem one
*
*******************************************************************************/

#include <iostream>

#define LIMIT 1000

int main()
{
	int sum = 0;
	
	for(int b = 1; b < LIMIT; b++)
	{
		  // If multiple of three
		if(b % 3 == 0)
		{
			sum += b;
			continue;
		}
		
		  // If multiple of five
		if(b % 5 == 0)
		{
			sum += b;
		}
	}
	
	std::cout << "\nThe sum of all multiples of three and five under " << LIMIT << " is: " << sum << std::endl;
	
	return 0;
}