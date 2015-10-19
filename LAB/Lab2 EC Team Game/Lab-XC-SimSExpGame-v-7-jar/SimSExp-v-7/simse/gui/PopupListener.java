/* File generated by: simse.codegenerator.guigenerator.PopupListenerGenerator */
package simse.gui;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class PopupListener extends MouseAdapter
{
JPopupMenu popup;
boolean enabled;
SimSEGUI gui;

public PopupListener(JPopupMenu popupMenu, SimSEGUI g)
{
popup = popupMenu;
enabled = true;
gui = g;
}

public boolean isEnabled()
{
return enabled;
}

public void setEnabled(boolean e)
{
enabled = e;
}

public void mousePressed(MouseEvent e)
{
maybeShowPopup(e);
}

public void mouseReleased(MouseEvent e)
{
maybeShowPopup(e);
}

public JPopupMenu getPopupMenu()
{
return popup;
}
private void maybeShowPopup(MouseEvent e)
{
// disable the popup if the engine is running
if(e.isPopupTrigger() && isEnabled() && !gui.getEngine().isRunning())
{
popup.show(e.getComponent(), e.getX(), e.getY());
}
}
}