/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaapp.view;

import cinetest.IViewEventListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;
import org.w3c.dom.Document;
import org.w3c.dom.html.HTMLFormElement;

public class MainView {

    private WebView myBrowser;
    private WebEngine myWebEngine;
    private URL url;

    private List<IViewEventListener> list_listeners;

    public MainView(URL url) {
        list_listeners = new ArrayList<>();
        myBrowser = new WebView();
        myWebEngine = myBrowser.getEngine();
        if (url == null) {
            this.url = this.getClass().getResource("/Web/index.html");
        } else {
            this.url = url;
        }
        myWebEngine.load(this.url.toString());

        //Load Page Status
        myWebEngine.getLoadWorker().stateProperty().addListener(
                (ObservableValue<? extends Worker.State> ov, Worker.State oldState,
                        Worker.State newState) -> {
                    if (newState == Worker.State.SUCCEEDED) {
                        System.out.println("page loaded");
                        JSObject win = (JSObject) myWebEngine.executeScript("window");
                        win.setMember("jHelper", new JavaHelper(myWebEngine));
                        System.out.println(myWebEngine.getDocument().getElementById("user_name").getNodeValue());
                    }
                }
        );

      /*  myWebEngine.documentProperty().addListener(
                (ObservableValue<? extends Document> ov, Document oldDoc, Document doc) -> {
                    if (doc != null) {
                        if (doc.getElementsByTagName("form").getLength() > 0) {
                            HTMLFormElement form = (HTMLFormElement) doc.getElementsByTagName("form").item(0);
                            System.out.println(form.getAttribute("action"));
                            if ("/Web/SignUp_Submit".equals(form.getAttribute("action"))) {
                                   System.out.println("ATRODE!");
                                   Event evento = new Event("Submit", null, EventType.ROOT);
                                   for(Iterator<IViewEventListener> iterator = list_listeners.iterator(); iterator.hasNext();) {
                                        IViewEventListener next = iterator.next();
                                        next.listen(evento);
                                }
                            }
                        }
                    }
                }
        );
        */
        
    }
    
    public MainView() {
        this(null);
    }

    public WebView getMyBrowser() {
        return myBrowser;
    }

    public URL getUrl() {
        return url;
    }

    public void loadUrl(URL url) {
        this.url = url;
        myWebEngine.load(url.toString());
    }

    public String GetElementByID(String elementId) {
        return myWebEngine.getDocument().getElementById(elementId).getNodeValue();
    }

    public void AddToList(IViewEventListener iv) {
        list_listeners.add(iv);
    }

    public void RemoveOfList(IViewEventListener iv) {
        list_listeners.remove(iv);
    }
}
