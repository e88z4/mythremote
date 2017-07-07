package mythremote;

import javafx.fxml.FXML;
import mythapi.frontend.*;
import javafx.event.*;
import javafx.scene.control.*;

import javax.annotation.Resource;
import javax.swing.*;
import java.net.Inet4Address;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

public class Controller {
    @FXML private TextField textField_Host;
    @FXML private TextField textField_Port;
    @FXML private TextArea textArea_Status;



    public void TextFieldHost_OnInputMethodTextChange(ActionEvent event)
    {
        String host = textField_Host.getText();
        try {
            Inet4Address.getByName(host);
        }
        catch (UnknownHostException ex)
        {
            textArea_Status.setText(ex.toString());
        }
    }

    public void TextFieldPort_OnInputMethodTextChange(ActionEvent event)
    {
        String port = textField_Port.getText();
        try
        {
            int parsedPort = Integer.parseInt(port);

            if(parsedPort > 65535 && parsedPort < 1)
                textArea_Status.setText("Port must be between 1 to 65535");
        }
        catch(NumberFormatException ex)
        {
            textArea_Status.setText("Port is not a valid integer. The range is between 1 to 65535");
        }
    }

    public void ButtonPressed(ActionEvent event)
    {
        // determine which button is pressed,
        // launch API call
        boolean response = false;
        Button target = (Button)event.getTarget();
        String buttonId = target.getId();
        String host = textField_Host.getText();
        String port = textField_Port.getText();

        StringBuilder responseText = new StringBuilder();

        try {
            switch (buttonId) {
                case "button_0":
                    response = Helper.SendKey(host, port, "0");
                    responseText.append("Button 0 was pressed. Response: " + response);
                    break;

                case "button_1":
                    response = Helper.SendKey(host, port, "1");
                    responseText.append("Button 1 was pressed. Response: " + response);
                    break;

                case "button_2":
                    response = Helper.SendKey(host, port, "2");
                    responseText.append("Button 2 was pressed. Response: " + response);
                    break;

                case "button_3":
                    response = Helper.SendKey(host, port, "3");
                    responseText.append("Button 3 was pressed. Response: " + response);
                    break;

                case "button_4":
                    response = Helper.SendKey(host, port, "4");
                    responseText.append("Button 4 was pressed. Response: " + response);
                    break;

                case "button_5":
                    response = Helper.SendKey(host, port, "5");
                    responseText.append("Button 5 was pressed. Response: " + response);
                    break;

                case "button_6":
                    response = Helper.SendKey(host, port, "6");
                    responseText.append("Button 6 was pressed. Response: " + response);
                    break;

                case "button_7":
                    response = Helper.SendKey(host, port, "7");
                    responseText.append("Button 7 was pressed. Response: " + response);
                    break;

                case "button_8":
                    response = Helper.SendKey(host, port, "8");
                    responseText.append("Button 8 was pressed. Response: " + response);
                    break;

                case "button_9":
                    response = Helper.SendKey(host, port, "9");
                    responseText.append("Button 9 was pressed. Response: " + response);
                    break;

                case "button_Menu":
                    response = Helper.SendKey(host, port, "M");
                    responseText.append("Button menu was pressed. Response: " + response);
                    break;

                case "button_Info":
                    response = Helper.SendKey(host, port, "I");
                    responseText.append("Button info was pressed. Response: " + response);
                    break;

                case "button_Back":
                    response = Helper.SendKey(host, port, "ESCAPE");
                    responseText.append("Button back was pressed. Response: " + response);
                    break;

                case "button_Mute":
                    response = Helper.SendKey(host, port, "|");
                    responseText.append("Button mute was pressed. Response: " + response);
                    break;

                case "button_Left":
                    response = Helper.SendKey(host, port, "LEFT");
                    responseText.append("Button left was pressed. Response: " + response);
                    break;

                case "button_Up":
                    response = Helper.SendKey(host, port, "UP");
                    responseText.append("Button up was pressed. Response: " + response);
                    break;

                case "button_Down":
                    response = Helper.SendKey(host, port, "DOWN");
                    responseText.append("Button down was pressed. Response: " + response);
                    break;


                case "button_Right":
                    response = Helper.SendKey(host, port, "RIGHT");
                    responseText.append("Button right was pressed. Response: " + response);
                    break;

                case "button_Enter":
                    response = Helper.SendKey(host, port, "ENTER");
                    responseText.append("Button enter was pressed. Response: " + response);
                    break;

                case "button_VolumeUp":
                    response = Helper.SendKey(host, port, "]");
                    responseText.append("Button volume+ was pressed. Response: " + response);
                    break;

                case "button_VolumeDown":
                    response = Helper.SendKey(host, port, "[");
                    responseText.append("Button volumen- was pressed. Response: " + response);
                    break;

                case "button_SkipCommBack":
                    response = Helper.SendKey(host, port, "Q");
                    responseText.append("Button skip commercial back was pressed. Response: " + response);
                    break;

                case "button_Pause":
                    response = Helper.SendKey(host, port, "P");
                    responseText.append("Button pause was pressed. Response: " + response);
                    break;

                case "button_SkipCommercial":
                    response = Helper.SendKey(host, port, "Z");
                    responseText.append("Button skip commercial was pressed. Response: " + response);
                    break;
            }
        }
        catch (MalformedURLException ex)
        {
            responseText.append(ex.toString());
        }
        textArea_Status.setText(responseText.toString());
    }
}
