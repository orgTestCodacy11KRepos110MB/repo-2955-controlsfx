/**
 * Copyright (c) 2013, ControlsFX
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *     * Neither the name of ControlsFX, any associated website, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL CONTROLSFX BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.controlsfx.samples;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.controlsfx.ControlsFXSample;
import org.controlsfx.tools.Borders;

public class HelloBorders extends ControlsFXSample {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override public String getSampleName() {
        return "Borders";
    }
    
    @Override public String getJavaDocURL() {
        return Utils.JAVADOC_BASE + "org/controlsfx/tools/Borders.html";
    }
    
    @Override public boolean isVisible() {
        return true;
    }
    
    @Override public Node getPanel(Stage stage) {
        Pane root = new Pane();
        
        Button button = new Button("Hello World!");
        Node wrappedButton = Borders.wrap(button)
//                                                 .emptyBorder()
//                                                     .padding(20)
//                                                     .build()
                                                 .lineBorder()
                                                     .title("Line")
//                                                     .color(Color.GREEN)
//                                                     .thickness(1, 0, 0, 0)
                                                     .thickness(1)
                                                     .radius(0, 5, 5, 0)
                                                     .build()
                                                 .emptyBorder()
                                                     .padding(20)
                                                     .build()
                                                 .etchedBorder()
                                                     .title("Etched")
                                                     .build()
                                                 .emptyBorder()
                                                     .padding(20)
                                                     .build()
                                                 .build();
        
        
        root.getChildren().add(wrappedButton);
        
        return root;
    }
    
    @Override public String getSampleDescription() {
        return "A utility class that allows you to wrap JavaFX Nodes with a border, "
                + "in a way somewhat analogous to the Swing BorderFactory (although "
                + "with less options as a lot of what the Swing BorderFactory offers "
                + "resulted in ugly borders!)."
                + "\n\nThe Borders class provides a fluent API for specifying the "
                + "properties of each border. It is possible to create multiple "
                + "borders around a Node simply by continuing to call additional "
                + "methods before you call the final build() method. To use the "
                + "Borders class, you simply call wrap(Node), passing in the Node "
                + "you wish to wrap the border(s) around.";
    }
    
    @Override
    public Node getControlPanel() {
        // TODO Auto-generated method stub
        return super.getControlPanel();
    }
}