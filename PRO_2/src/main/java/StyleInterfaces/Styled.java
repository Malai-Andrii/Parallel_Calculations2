package StyleInterfaces;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public interface Styled {
    int BUTTONS_NUMBER = 4;
    int FONT_SIZE = 16;
    int TITLE_FONT_SIZE = 20;
    Font FONT = new Font("Arial Black", Font.PLAIN, FONT_SIZE);
    Font TITLE_FONT = new Font("Arial Black", Font.PLAIN, TITLE_FONT_SIZE);

    /*                           Colours                                 */
    Color DARK_VIOLET_COLOR = new Color(28,25,19);
    Color BLACK =  new Color(0,0,0);
    Color WHITE =  new Color(255,255,255);
    Color GREEN1 = new Color(40,103,5);

    /*                           Panels                                 */
    Color DARK_GREY = new Color(68,40,33);
    Color DARK_RED = new Color(128,50,33);

    /*                           Menu Style                              */
    int MENU_FONT_SIZE = 22;
    Font MENU_FONT = new Font("Arial Black", Font.PLAIN, FONT_SIZE);
    Color MENU_BACKGROUND = new Color(255,255,255);
    Color MENU_FOREGROUND = new Color(0,0,0);
    default void SET_MENU_STYLES(Object OBJECT, Color FOREGROUND, Color BACKGROUND, Font FONT){
        if(OBJECT instanceof JMenuBar){
            ((JMenuBar) OBJECT).setForeground(FOREGROUND);
            ((JMenuBar) OBJECT).setBackground(BACKGROUND);
            ((JMenuBar) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JMenuItem){
            ((JMenuItem) OBJECT).setForeground(FOREGROUND);
            ((JMenuItem) OBJECT).setBackground(BACKGROUND);
            ((JMenuItem) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JMenu){
            ((JMenu) OBJECT).setForeground(FOREGROUND);
            ((JMenu) OBJECT).setBackground(BACKGROUND);
            ((JMenu) OBJECT).setFont(FONT);
        }
    }
    default void STYLE_MENU(Object... objects){
        for(Object object:objects){
            SET_MENU_STYLES(object,MENU_FOREGROUND,MENU_BACKGROUND,MENU_FONT);
        }
    }
    /*                           Swing Elements Style                    */
    Dimension BUTTON_MAXIMUM_SIZE = new Dimension(FONT_SIZE * 18, FONT_SIZE * 8);
    Dimension BUTTON_PREFERED_SIZE = new Dimension(FONT_SIZE * 15, FONT_SIZE * 8);
    Insets INSETS = new Insets(2, 2, 2, 2);
    default void SET_MAIN_STYLES(Object OBJECT, Color FOREGROUND, Color BACKGROUND, Font FONT){
        if(OBJECT instanceof JScrollPane){
            ((JScrollPane) OBJECT).setForeground(FOREGROUND);
            ((JScrollPane) OBJECT).setBackground(BACKGROUND);
            ((JScrollPane) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JRadioButton){
            ((JRadioButton) OBJECT).setForeground(FOREGROUND);
            ((JRadioButton) OBJECT).setBackground(BACKGROUND);
            ((JRadioButton) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JButton){
            ((JButton) OBJECT).setForeground(FOREGROUND);
            ((JButton) OBJECT).setBackground(BACKGROUND);
            ((JButton) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JPanel){
            ((JPanel) OBJECT).setForeground(FOREGROUND);
            ((JPanel) OBJECT).setBackground(BACKGROUND);
            ((JPanel) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JLabel){
            ((JLabel) OBJECT).setForeground(FOREGROUND);
            ((JLabel) OBJECT).setBackground(BACKGROUND);
            ((JLabel) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JCheckBox){
            ((JCheckBox) OBJECT).setForeground(FOREGROUND);
            ((JCheckBox) OBJECT).setBackground(BACKGROUND);
            ((JCheckBox) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JTextField){
            ((JTextField) OBJECT).setForeground(FOREGROUND);
            ((JTextField) OBJECT).setBackground(BACKGROUND);
            ((JTextField) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JTextArea){
            ((JTextArea) OBJECT).setForeground(FOREGROUND);
            ((JTextArea) OBJECT).setBackground(BACKGROUND);
            ((JTextArea) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JPasswordField){
            ((JPasswordField) OBJECT).setForeground(FOREGROUND);
            ((JPasswordField) OBJECT).setBackground(BACKGROUND);
            ((JPasswordField) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JFormattedTextField){
            ((JFormattedTextField) OBJECT).setForeground(FOREGROUND);
            ((JFormattedTextField) OBJECT).setBackground(BACKGROUND);
            ((JFormattedTextField) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JTextPane){
            ((JTextPane) OBJECT).setForeground(FOREGROUND);
            ((JTextPane) OBJECT).setBackground(BACKGROUND);
            ((JTextPane) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JEditorPane){
            ((JEditorPane) OBJECT).setForeground(FOREGROUND);
            ((JEditorPane) OBJECT).setBackground(BACKGROUND);
            ((JEditorPane) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JComboBox){
            ((JComboBox) OBJECT).setForeground(FOREGROUND);
            ((JComboBox) OBJECT).setBackground(BACKGROUND);
            ((JComboBox) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JTable){
            ((JTable) OBJECT).setForeground(FOREGROUND);
            ((JTable) OBJECT).setBackground(BACKGROUND);
            ((JTable) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JList){
            ((JList) OBJECT).setForeground(FOREGROUND);
            ((JList) OBJECT).setBackground(BACKGROUND);
            ((JList) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JTree){
            ((JTree) OBJECT).setForeground(FOREGROUND);
            ((JTree) OBJECT).setBackground(BACKGROUND);
            ((JTree) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JTabbedPane){
            ((JTabbedPane) OBJECT).setForeground(FOREGROUND);
            ((JTabbedPane) OBJECT).setBackground(BACKGROUND);
            ((JTabbedPane) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JSplitPane){
            ((JSplitPane) OBJECT).setForeground(FOREGROUND);
            ((JSplitPane) OBJECT).setBackground(BACKGROUND);
            ((JSplitPane) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JSpinner){
            ((JSpinner) OBJECT).setForeground(FOREGROUND);
            ((JSpinner) OBJECT).setBackground(BACKGROUND);
            ((JSpinner) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JSlider){
            ((JSlider) OBJECT).setForeground(FOREGROUND);
            ((JSlider) OBJECT).setBackground(BACKGROUND);
            ((JSlider) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JSeparator){
            ((JSeparator) OBJECT).setForeground(FOREGROUND);
            ((JSeparator) OBJECT).setBackground(BACKGROUND);
            ((JSeparator) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JProgressBar){
            ((JProgressBar) OBJECT).setForeground(FOREGROUND);
            ((JProgressBar) OBJECT).setBackground(BACKGROUND);
            ((JProgressBar) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JToolBar){
            ((JToolBar) OBJECT).setForeground(FOREGROUND);
            ((JToolBar) OBJECT).setBackground(BACKGROUND);
            ((JToolBar) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JToolBar.Separator){
            ((JToolBar.Separator) OBJECT).setForeground(FOREGROUND);
            ((JToolBar.Separator) OBJECT).setBackground(BACKGROUND);
            ((JToolBar.Separator) OBJECT).setFont(FONT);
        }
        if(OBJECT instanceof JScrollBar){
            ((JScrollBar) OBJECT).setForeground(FOREGROUND);
            ((JScrollBar) OBJECT).setBackground(BACKGROUND);
            ((JScrollBar) OBJECT).setFont(FONT);
        }
    }
    default void STYLE_LABELS_BUTTONS_PANELS(Object... objects){
        for(Object object:objects){
            SET_MAIN_STYLES(object,WHITE,DARK_VIOLET_COLOR,FONT);
        }
    }
    default void STYLE_TEXT_AREA_AND_FIELDS(Object... objects){
        for(Object object:objects){
            SET_MAIN_STYLES(object,DARK_VIOLET_COLOR,WHITE,FONT);
        }
    }
    default void STYLE_COMBO_BOX_SPINNER(Object... objects){
        for(Object object:objects){
            SET_MAIN_STYLES(object,DARK_VIOLET_COLOR,WHITE,FONT);
        }
    }
    default void STYLE_RADIO_CHECKBOX(Object... objects){
        for(Object object:objects){
            SET_MAIN_STYLES(object,WHITE,DARK_VIOLET_COLOR,FONT);
        }
    }
    default Border SET_BORDER(String name){
        Border border = BorderFactory.createLineBorder(WHITE,1,true);
        TitledBorder title = BorderFactory.createTitledBorder(border, name);
        title.setTitleColor(WHITE);
        title.setTitleFont(FONT);
        return title;
    }
}
