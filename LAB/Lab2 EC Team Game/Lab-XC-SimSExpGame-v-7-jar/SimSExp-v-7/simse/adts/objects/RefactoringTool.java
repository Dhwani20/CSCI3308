/* File generated by: simse.codegenerator.stategenerator.ADTGenerator */
package simse.adts.objects;
public class RefactoringTool extends Tool implements Cloneable
{
private String description;
private double productivityincreasefactor;

public RefactoringTool(String d0, double p1)
{
setDescription(d0);
setProductivityIncreaseFactor(p1);
}

public Object clone() {
RefactoringTool cl = (RefactoringTool)(super.clone());
cl.description = description;
cl.productivityincreasefactor = productivityincreasefactor;
return cl;
}

public String getDescription()
{
return description;
}

public void setDescription(String a)
{
description = a;
}

public double getProductivityIncreaseFactor()
{
return productivityincreasefactor;
}

public void setProductivityIncreaseFactor(double a)
{
if(a < 0.0)
{
productivityincreasefactor = 0.0;
}
else if(a > 1.0)
{
productivityincreasefactor = 1.0;
}
else
{
productivityincreasefactor = a;
}
}

}