package paquete;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Gonzalo Izuzquiza
 */
public class DOM {
    
         Document doc = null ; // resepresenta al arbol del DOM
    
    public int abrir_XML_DOM (File fichero){
             
      try{
        // se crea un objeto de tipo DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        // para ignorar los comentario del xml
        factory.setIgnoringComments(true);
        
        // para ignorar los espacios en blanco del xml
        factory.setIgnoringElementContentWhitespace(true);
        
        // para cargar la estructura en arbol del DOM
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        // interpreta el XML y genera el DOM equivalente
        doc = (Document) builder.parse(fichero);
        
        return 0; // con esto el doc ya apunta al arbol del DOM listo para ser recorrido

        } catch (Exception e){
            e.printStackTrace();
            return -1;
            }
    }
    
    public String recorrerDOMyMostrarlo (Document doc){
       
       String datos_nodo[] = null;
       String salida = "";
       Node node;
       
       //obtencion del primer numero del DOM (1º hijo)
       Node raiz = doc.getFirstChild();
       
       //obtencion de lista de nodos hijos del raiz
       NodeList nodelist = raiz.getChildNodes();
       
       //procesamiento de los nodos hijos
       for (int i=0; i<nodelist.getLength(); i++){
           node = nodelist.item(i);
           
           if (node.getNodeType() == Node.ELEMENT_NODE){
               
               //es nodo
               datos_nodo = procesarLibro(node);
               
               salida = salida + "\n" + "Publicado en:" + datos_nodo[0];
               salida = salida + "\n" + "El autor es:" + datos_nodo[2];
               salida = salida + "\n" + "EL título es:" + datos_nodo[1];
               salida = salida + "\n -----------------";
           }
       }
       return salida;
    }
    
    protected String[] procesarLibro(Node n){
        
        String datos[] = new String[3];
        Node ntemp = null;
        int contador = 1;
        
        //obtencion del primer atributo del nodo
        datos[0] = n.getAttributes().item(0).getNodeValue();
        
        //obtencion de los hijos del libro que son el titulo y el autor
        NodeList nodos = n.getChildNodes();
        
        for (int i=0; i<nodos.getLength(); i++){
            
            ntemp = nodos.item(i);
            
            if (ntemp.getNodeType() == Node.ELEMENT_NODE){
                
                //obtencion del texto del titulo y autor accediendo al nodo text hijo de ntemp y se saca su valor
                datos[contador] = ntemp.getChildNodes().item(0).getNodeValue();
                
                contador++;
                
            }
        }
        return datos;
    }

    public int annadirDOM (String titulo, String autor, String anno){
        
        try {
            
            //creamos un nodo para el titulo, se crea tipo texto y se añade
            Node ntitulo = doc.createElement("Título");
            Node ntitulo_text = doc.createTextNode(titulo);
            ntitulo.appendChild(ntitulo_text);
            
            //creamos un nodo para el autor, se crea tipo texto y se añade
            Node nautor = doc.createElement("Autor");
            Node nautor_text = doc.createTextNode(autor);
            nautor.appendChild(nautor_text);
            
            // creamos un nodo para libro
            Node nlibro = doc.createElement("Libro");
            //añadimos un atributo
            ((Element)nlibro).setAttribute("publicado_en", anno);
            //añadimos a libro el autor y titulo 
            nlibro.appendChild(ntitulo);
            nlibro.appendChild(nautor);
            
            //obtenemos el primer nodo del documento y se le añade como hijo del nodo libro
            Node raiz = doc.getChildNodes().item(0);
            raiz.appendChild(nlibro);
            
            return 0;
            
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public int guardarDOMcomoFILE(){
        
        try {
            
            //creamos un fichero llamado salida.xml
            File archivo_xml = new File("salida.xml");
            
            //especificamos el formato de salida
            OutputFormat format = new OutputFormat(doc);
            
            //especificamos que la salida este identada
            format.setIndenting(true);
            
            //escribe el contenido en el FILE
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo_xml), format);            
            serializer.serialize(doc);
                   
            return 0;
            
        } catch (Exception e) {
            return -1;
        }
    }
    
}
