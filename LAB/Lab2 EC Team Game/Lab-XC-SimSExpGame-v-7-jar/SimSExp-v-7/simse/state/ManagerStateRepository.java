/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;
import simse.adts.objects.*;
import java.util.*;
public class ManagerStateRepository implements Cloneable
{
private Vector <Manager> managers;

public ManagerStateRepository()
{
managers = new Vector<Manager>();
}

public Object clone() {
try {
ManagerStateRepository cl = (ManagerStateRepository) super.clone();
Vector<Manager> clonedmanagers = new Vector<Manager>();
for (int i = 0; i < managers.size(); i++) {
clonedmanagers.addElement((Manager)(managers.elementAt(i).clone()));
}
cl.managers = clonedmanagers;
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}

public void add(Manager a)
{
boolean add = true;
for(int i=0; i<managers.size(); i++)
{
Manager manager = managers.elementAt(i);
if(manager.getName().equals(a.getName()))
{
add = false;
break;
}
}
if(add)
{
managers.add(a);
}
}

public Manager get(String name)
{
for(int i=0; i<managers.size(); i++)
{
if(managers.elementAt(i).getName().equals(name))
{
return managers.elementAt(i);
}
}
return null;
}

public Vector<Manager> getAll()
{
return managers;
}

public boolean remove(Manager a)
{
return managers.remove(a);
}
}