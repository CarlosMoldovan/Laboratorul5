package CalculateGrade;
class Grade{
 
public double convertCtoF(double gradeCelcius)
{
    return (gradeCelcius*1.8)+32;
}
public double convertFtoC(double gradeFahrenheit)
{
    return (gradeFahrenheit-32)/1.8;
}
}