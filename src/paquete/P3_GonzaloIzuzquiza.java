package paquete;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Gonzalo Izuzquiza
 */
public class P3_GonzaloIzuzquiza extends javax.swing.JFrame {

    DOM gesDom = new DOM();
    SAX gesSax = new SAX();
    JAXB gesJaxb = new JAXB();

    public P3_GonzaloIzuzquiza() {
        initComponents();
        this.getContentPane().setBackground(Color.RED); // damos color al fondo del jFrame
        this.setLocationRelativeTo(null); // con esto hacemos que la pnatalla se abra en el centro de la pantalla
        setSize(840, 540); //con esto damo un tamñano pasando dos parametros, siendo ancho y alto, a la pantalla
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_sax = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        abrir1 = new javax.swing.JButton();
        mostrar1 = new javax.swing.JButton();
        cargado1 = new javax.swing.JLabel();
        texto_sax = new javax.swing.JLabel();
        menu1 = new javax.swing.JMenuBar();
        tipos1 = new javax.swing.JMenu();
        dom1 = new javax.swing.JMenuItem();
        sax1 = new javax.swing.JMenuItem();
        jaxb1 = new javax.swing.JMenuItem();
        frame_jaxb = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        abrir2 = new javax.swing.JButton();
        mostrar2 = new javax.swing.JButton();
        cargado2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu2 = new javax.swing.JMenuBar();
        tipos2 = new javax.swing.JMenu();
        dom2 = new javax.swing.JMenuItem();
        sax2 = new javax.swing.JMenuItem();
        jaxb2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        abrir = new javax.swing.JButton();
        annadir = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        texto_publicado = new javax.swing.JTextField();
        publicado = new javax.swing.JLabel();
        texto_autor = new javax.swing.JTextField();
        autor = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        texto_titulo = new javax.swing.JTextField();
        annadido = new javax.swing.JLabel();
        cargado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        tipos = new javax.swing.JMenu();
        dom = new javax.swing.JMenuItem();
        sax = new javax.swing.JMenuItem();
        jaxb = new javax.swing.JMenuItem();

        frame_sax.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        texto1.setColumns(20);
        texto1.setRows(5);
        jScrollPane2.setViewportView(texto1);

        abrir1.setBackground(new java.awt.Color(255, 255, 255));
        abrir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        abrir1.setText("ABRIR");
        abrir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrir1MouseClicked(evt);
            }
        });

        mostrar1.setBackground(new java.awt.Color(255, 255, 255));
        mostrar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mostrar1.setText("MOSTRAR");
        mostrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar1MouseClicked(evt);
            }
        });

        cargado1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        texto_sax.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        texto_sax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_sax.setText("SAX");

        tipos1.setText("Tipos");

        dom1.setText("DOM");
        dom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dom1ActionPerformed(evt);
            }
        });
        tipos1.add(dom1);

        sax1.setText("SAX");
        sax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sax1ActionPerformed(evt);
            }
        });
        tipos1.add(sax1);

        jaxb1.setText("JAXB");
        jaxb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaxb1ActionPerformed(evt);
            }
        });
        tipos1.add(jaxb1);

        menu1.add(tipos1);

        frame_sax.setJMenuBar(menu1);

        javax.swing.GroupLayout frame_saxLayout = new javax.swing.GroupLayout(frame_sax.getContentPane());
        frame_sax.getContentPane().setLayout(frame_saxLayout);
        frame_saxLayout.setHorizontalGroup(
            frame_saxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_saxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frame_saxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abrir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(cargado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto_sax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        frame_saxLayout.setVerticalGroup(
            frame_saxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_saxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frame_saxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(frame_saxLayout.createSequentialGroup()
                        .addComponent(abrir1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargado1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto_sax, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );

        frame_jaxb.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        texto2.setColumns(20);
        texto2.setRows(5);
        jScrollPane3.setViewportView(texto2);

        abrir2.setBackground(new java.awt.Color(255, 255, 255));
        abrir2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        abrir2.setText("ABRIR");
        abrir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrir2MouseClicked(evt);
            }
        });

        mostrar2.setBackground(new java.awt.Color(255, 255, 255));
        mostrar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mostrar2.setText("MOSTRAR");
        mostrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar2MouseClicked(evt);
            }
        });

        cargado2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JAXB");

        tipos2.setText("Tipos");

        dom2.setText("DOM");
        dom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dom2ActionPerformed(evt);
            }
        });
        tipos2.add(dom2);

        sax2.setText("SAX");
        sax2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sax2ActionPerformed(evt);
            }
        });
        tipos2.add(sax2);

        jaxb2.setText("JAXB");
        jaxb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaxb2ActionPerformed(evt);
            }
        });
        tipos2.add(jaxb2);

        menu2.add(tipos2);

        frame_jaxb.setJMenuBar(menu2);

        javax.swing.GroupLayout frame_jaxbLayout = new javax.swing.GroupLayout(frame_jaxb.getContentPane());
        frame_jaxb.getContentPane().setLayout(frame_jaxbLayout);
        frame_jaxbLayout.setHorizontalGroup(
            frame_jaxbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_jaxbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frame_jaxbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abrir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrar2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(cargado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        frame_jaxbLayout.setVerticalGroup(
            frame_jaxbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_jaxbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frame_jaxbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(frame_jaxbLayout.createSequentialGroup()
                        .addComponent(abrir2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargado2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        abrir.setBackground(new java.awt.Color(255, 255, 255));
        abrir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        abrir.setText("ABRIR");
        abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirMouseClicked(evt);
            }
        });

        annadir.setBackground(new java.awt.Color(255, 255, 255));
        annadir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        annadir.setText("AÑADIR");
        annadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annadirMouseClicked(evt);
            }
        });

        mostrar.setBackground(new java.awt.Color(255, 255, 255));
        mostrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mostrar.setText("MOSTRAR");
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMouseClicked(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        publicado.setBackground(new java.awt.Color(255, 255, 255));
        publicado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        publicado.setText("Publicado");

        autor.setBackground(new java.awt.Color(255, 255, 255));
        autor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        autor.setText("Autor");

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titulo.setText("Título");

        annadido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cargado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOM");

        tipos.setText("Tipos");

        dom.setText("DOM");
        dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domActionPerformed(evt);
            }
        });
        tipos.add(dom);

        sax.setText("SAX");
        sax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saxActionPerformed(evt);
            }
        });
        tipos.add(sax);

        jaxb.setText("JAXB");
        jaxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaxbActionPerformed(evt);
            }
        });
        tipos.add(jaxb);

        menu.add(tipos);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(publicado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_publicado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(annadido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publicado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_publicado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(annadir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annadido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMouseClicked
        //creamos el file chooser
        JFileChooser ch = new JFileChooser();

        try {
            if (ch.showOpenDialog(null) == ch.APPROVE_OPTION) {
                File fichero = ch.getSelectedFile(); // ruta en la que va a buscar
                gesDom.abrir_XML_DOM(fichero); // le pasamos la ruta al reader para que lo lea
                cargado.setText("Archivo cargado correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error"); // si algo se hace mal dará error
        }
    }//GEN-LAST:event_abrirMouseClicked

    private void annadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annadirMouseClicked
        if (!texto_publicado.getText().isEmpty()) {
            if (!texto_autor.getText().isEmpty()) {
                if (!texto_titulo.getText().isEmpty()) {
                    gesDom.annadirDOM(texto_publicado.getText(), texto_autor.getText(), texto_titulo.getText()); // añade al documento otro libro
                    annadido.setText("Añadido correctamente");
                }
            }
        }
    }//GEN-LAST:event_annadirMouseClicked

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked
        texto.setText(gesDom.recorrerDOMyMostrarlo(gesDom.doc)); //nos muestra el contenido del documento 
    }//GEN-LAST:event_mostrarMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        File fichero;
        String nombreDelArchivo = "";
        int ruta;

        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setDialogType(JFileChooser.SAVE_DIALOG);
        ruta = fc.showSaveDialog(this);

        try {
            if (ruta == JFileChooser.APPROVE_OPTION) {
                fichero = fc.getSelectedFile();
                nombreDelArchivo = fichero.toString() + ".xml";
                if (gesDom.guardarDOMcomoFILE(nombreDelArchivo) == 0) {
                    gesDom.guardarDOMcomoFILE(nombreDelArchivo);
                } else {
                    String mensaje = "Error al guardar";
                    JOptionPane.showMessageDialog(new JFrame(), mensaje, "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            if (ruta == JFileChooser.CANCEL_OPTION) {
                System.out.println(ruta);
            }
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void abrir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrir1MouseClicked
        //creamos el file chooser
        JFileChooser co = new JFileChooser();

        try {
            if (co.showOpenDialog(null) == co.APPROVE_OPTION) {
                File fichero = co.getSelectedFile(); // ruta en la que va a buscar
                gesSax.abrir_XML_SAX(fichero); // le pasamos la ruta al reader para que lo lea
                cargado1.setText("Se van a mostrar los libros de este documento");
            }
        } catch (Exception e) {
            System.out.println("Error"); // si algo se hace mal dará error
        }
    }//GEN-LAST:event_abrir1MouseClicked

    private void mostrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar1MouseClicked
        texto1.setText(gesSax.recorrerSAX()); //nos muestra el contenido del documento 
    }//GEN-LAST:event_mostrar1MouseClicked

    private void abrir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrir2MouseClicked
        //creamos el file chooser
        JFileChooser cs = new JFileChooser();

        try {
            if (cs.showOpenDialog(null) == cs.APPROVE_OPTION) {
                File fichero = cs.getSelectedFile(); // ruta en la que va a buscar
                gesJaxb.abrir_XML_JAXB(fichero); // le pasamos la ruta al reader para que lo lea
                cargado2.setText("Archivo cargado correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error"); // si algo se hace mal dará error
        }
    }//GEN-LAST:event_abrir2MouseClicked

    private void mostrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar2MouseClicked
        texto2.setText(gesJaxb.recorrerJAXByMostrar()); //nos muestra el contenido del documento 
    }//GEN-LAST:event_mostrar2MouseClicked

    private void domActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domActionPerformed
        frame_sax.setVisible(false);
        frame_jaxb.setVisible(false);
    }//GEN-LAST:event_domActionPerformed

    private void saxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saxActionPerformed
        frame_sax.setVisible(true);
        frame_jaxb.setVisible(false);
        frame_sax.getContentPane().setBackground(Color.RED);
        frame_sax.setSize(870, 540);
        frame_sax.setLocationRelativeTo(null);
    }//GEN-LAST:event_saxActionPerformed

    private void jaxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaxbActionPerformed
        frame_sax.setVisible(false);
        frame_jaxb.setVisible(true);
        frame_jaxb.getContentPane().setBackground(Color.RED);
        frame_jaxb.setSize(870, 540);
        frame_jaxb.setLocationRelativeTo(null);
    }//GEN-LAST:event_jaxbActionPerformed

    private void dom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dom2ActionPerformed
        this.setVisible(true);
        frame_sax.setVisible(false);
        frame_jaxb.setVisible(false);
        this.getContentPane().setBackground(Color.RED);
        this.setSize(870, 540);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_dom2ActionPerformed

    private void sax2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sax2ActionPerformed
        frame_sax.setVisible(true);
        frame_jaxb.setVisible(false);
        frame_sax.getContentPane().setBackground(Color.RED);
        frame_sax.setSize(870, 540);
        frame_sax.setLocationRelativeTo(null);
    }//GEN-LAST:event_sax2ActionPerformed

    private void jaxb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaxb2ActionPerformed
        frame_sax.setVisible(false);
        frame_jaxb.setVisible(true);
        frame_jaxb.getContentPane().setBackground(Color.RED);
        frame_jaxb.setSize(870, 540);
        frame_jaxb.setLocationRelativeTo(null);
    }//GEN-LAST:event_jaxb2ActionPerformed

    private void dom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dom1ActionPerformed
        this.setVisible(true);
        frame_sax.setVisible(false);
        frame_jaxb.setVisible(false);
        this.getContentPane().setBackground(Color.RED);
        this.setSize(870, 540);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_dom1ActionPerformed

    private void sax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sax1ActionPerformed
        frame_sax.setVisible(true);
        frame_jaxb.setVisible(false);
        frame_sax.getContentPane().setBackground(Color.RED);
        frame_sax.setSize(840, 540);
        frame_sax.setLocationRelativeTo(null);
    }//GEN-LAST:event_sax1ActionPerformed

    private void jaxb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaxb1ActionPerformed
        frame_sax.setVisible(false);
        frame_jaxb.setVisible(true);
        frame_jaxb.getContentPane().setBackground(Color.RED);
        frame_jaxb.setSize(870, 540);
        frame_jaxb.setLocationRelativeTo(null);
    }//GEN-LAST:event_jaxb1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(P3_GonzaloIzuzquiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P3_GonzaloIzuzquiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P3_GonzaloIzuzquiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P3_GonzaloIzuzquiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P3_GonzaloIzuzquiza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JButton abrir1;
    private javax.swing.JButton abrir2;
    private javax.swing.JLabel annadido;
    private javax.swing.JButton annadir;
    private javax.swing.JLabel autor;
    private javax.swing.JLabel cargado;
    private javax.swing.JLabel cargado1;
    private javax.swing.JLabel cargado2;
    private javax.swing.JMenuItem dom;
    private javax.swing.JMenuItem dom1;
    private javax.swing.JMenuItem dom2;
    private javax.swing.JFrame frame_jaxb;
    private javax.swing.JFrame frame_sax;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem jaxb;
    private javax.swing.JMenuItem jaxb1;
    private javax.swing.JMenuItem jaxb2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuBar menu1;
    private javax.swing.JMenuBar menu2;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrar1;
    private javax.swing.JButton mostrar2;
    private javax.swing.JLabel publicado;
    private javax.swing.JMenuItem sax;
    private javax.swing.JMenuItem sax1;
    private javax.swing.JMenuItem sax2;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextArea texto2;
    private javax.swing.JTextField texto_autor;
    private javax.swing.JTextField texto_publicado;
    private javax.swing.JLabel texto_sax;
    private javax.swing.JTextField texto_titulo;
    private javax.swing.JMenu tipos;
    private javax.swing.JMenu tipos1;
    private javax.swing.JMenu tipos2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
