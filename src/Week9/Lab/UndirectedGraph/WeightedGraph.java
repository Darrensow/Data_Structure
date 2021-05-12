package Week9.Lab.UndirectedGraph;// WIA/WIB1002 Data Structures
// part of Graphs implementation using List
import java.util.ArrayList;

class WeightedGraph<T extends Comparable<T>, N extends Comparable <N>> {
   Vertex<T,N> head;
   int size;
	
   public WeightedGraph()	{
      head=null;
      size=0;
   }
   
   public void clear() {   
      head=null;
   }

   public int getSize()   {
      return this.size;
   }
   
   public int getIndeg(T v)  {
      if (hasVertex(v))	{
         Vertex<T,N> temp = head;
         while (temp!=null) {
            if ( temp.vertexInfo.compareTo( v ) == 0 )
               return temp.indeg;
            temp=temp.nextVertex;
         }
      }
      return -1;
   }
         
   public int getOutdeg(T v)  {
      if (hasVertex(v))	{
         Vertex<T,N> temp = head;
         while (temp!=null) {
            if ( temp.vertexInfo.compareTo( v ) == 0 )
               return temp.outdeg;
            temp=temp.nextVertex;
         }
      }
      return -1;
   }

   public boolean hasVertex(T v)	{
      if (head==null)
         return false;
      Vertex<T,N> temp = head;
      while (temp!=null)	{
         if ( temp.vertexInfo.compareTo( v ) == 0 )
            return true;
         temp=temp.nextVertex;
      }
      return false;
   }

   public boolean addVertex(T v)	{
      if (!hasVertex(v))	{
         Vertex<T,N> temp=head;
         Vertex<T,N> newVertex = new Vertex<>(v, null); //create a vertex and point it to null
         if (head==null)   //no vertex exists in the graph
            head=newVertex;
         else {
            Vertex<T,N> previous=head;;
            while (temp!=null)  {
               previous=temp;
               temp=temp.nextVertex;
            }
            previous.nextVertex=newVertex;
         }
         size++;
         return true;
      }
      else
         return false;
   }
   
   public int getIndex(T v) {
      Vertex<T,N> temp = head;
      int pos=0;
      while (temp!=null)	{
         if ( temp.vertexInfo.compareTo( v ) == 0 )
            return pos;
         temp=temp.nextVertex;
         pos+=1;
      }
      return -1;
   }
   
   public ArrayList<T> getAllVertexObjects() {
      ArrayList<T> list = new ArrayList<>();
      Vertex<T,N> temp = head;
      while (temp!=null)	{
         list.add(temp.vertexInfo);
         temp=temp.nextVertex;
      }
      return list;
   }

   public ArrayList<Vertex<T,N>> getAllVertices() {
      ArrayList<Vertex<T,N>> list = new ArrayList<>();
      Vertex<T,N> temp = head;
      while (temp!=null)	{
         list.add(temp);
         temp=temp.nextVertex;
      }
      return list;
   }
   
   public T getVertex(int pos) {
      if (pos>size-1 || pos<0) 
         return null;
      Vertex<T,N> temp = head;
      for (int i=0; i<pos; i++)
         temp=temp.nextVertex;
      return temp.vertexInfo;
   }

   public boolean addEdge(T source, T destination, N w)   {
      if (head==null)
         return false;
      if (!hasVertex(source) || !hasVertex(destination)) 
         return false;
      Vertex<T,N> sourceVertex = head;
      while (sourceVertex!=null)	{
         if ( sourceVertex.vertexInfo.compareTo( source ) == 0 )   {
            // Reached source vertex, look for destination now
            Vertex<T,N> destinationVertex = head;
            while (destinationVertex!=null)	{
               if ( destinationVertex.vertexInfo.compareTo( destination ) == 0 )   {
                  // Reached destination vertex, adds the edge at the first position
                  //Edge<T,N> currentEdge = sourceVertex.firstEdge;                               //assigns the first edge to currentEdge
                  Edge<T,N> newEdge1 = new Edge<>(destinationVertex, w, sourceVertex.firstEdge);   //points the destVertex to the newVertex with a weighted edge
                  sourceVertex.firstEdge = newEdge1;     //points the first edge of the sourceVertex to the newEdge1 (newEdge1 points to the old edge)
                  sourceVertex.outdeg++;              //adds the outdeg of the source vertex
                  destinationVertex.indeg++;          //adds the indeg of the destination vertex
                  return true;
               }
               destinationVertex=destinationVertex.nextVertex;
            }
         }
         sourceVertex=sourceVertex.nextVertex;
      }
      return false;
   }

   public boolean addUndirectedEdge(T source, T destination, N w)   {
      if (head==null)
         return false;
      if (!hasVertex(source) || !hasVertex(destination))
         return false;
      Vertex<T,N> sourceVertex = head;
      while (sourceVertex!=null)	{
         if ( sourceVertex.vertexInfo.compareTo( source ) == 0 )   {
            // Reached source vertex, look for destination now
            Vertex<T,N> destinationVertex = head;
            while (destinationVertex!=null)	{
               if ( destinationVertex.vertexInfo.compareTo( destination ) == 0 )   {
                  // Reached destination vertex, adds the edge at the first position
                  Edge<T,N> currentEdge = sourceVertex.firstEdge;                      //assigns the first edge to currentEdge
                  Edge<T,N> newEdge = new Edge<>(destinationVertex, w, currentEdge);   //points the destVertex to the newVertex with a weighted edge
                  sourceVertex.firstEdge=newEdge;     //points the first edge of the sourceVertex to the newEdge (newEdge points to the old edge)
                  sourceVertex.outdeg++;              //adds the outdeg of the source vertex
                  destinationVertex.indeg++;          //adds the indeg of the destination vertex
                  return true;
               }
               destinationVertex=destinationVertex.nextVertex;
            }
         }
         sourceVertex=sourceVertex.nextVertex;
      }
      return false;
   }

   public boolean hasEdge(T source, T destination) {
      if (head==null) //no vertex exist
         return false;
      if (!hasVertex(source) || !hasVertex(destination)) //the source or destination vertex does not exist
         return false;
      Vertex<T,N> sourceVertex = head;
      while (sourceVertex!=null)	{ //loop through the graph to find the vertex in mind
         if ( sourceVertex.vertexInfo.compareTo( source ) == 0 )   {
            // Reached source vertex, look for destination now
            Edge<T,N> currentEdge = sourceVertex.firstEdge;                   //assign the first edge to the currentEdge
            while (currentEdge != null) {
               if (currentEdge.toVertex.vertexInfo.compareTo(destination)==0) //if there is an edge that points to a vertex that has the same info(<T>)
               // destination vertex found 
                  return true;
               currentEdge=currentEdge.nextEdge;                              //traverse through the edges for that vertex
            }
         }
         sourceVertex=sourceVertex.nextVertex;                                //traverse through the vertices of the graph
      }
      return false;
   }
   
   public N getEdgeWeight(T source, T destination) {
      N notFound=null;
      if (head==null)
         return notFound;
      if (!hasVertex(source) || !hasVertex(destination)) 
         return notFound;
      Vertex<T,N> sourceVertex = head;
      while (sourceVertex!=null)	{
         if ( sourceVertex.vertexInfo.compareTo( source ) == 0 )   {
            // Reached source vertex, look for destination now 
            Edge<T,N> currentEdge = sourceVertex.firstEdge;
            while (currentEdge != null) {
               if (currentEdge.toVertex.vertexInfo.compareTo(destination)==0) 
               // destination vertex found 
                  return currentEdge.weight;
               currentEdge=currentEdge.nextEdge;
            }
         }
         sourceVertex=sourceVertex.nextVertex;
      }
      return notFound;
   }
   
   public ArrayList<T> getNeighbours (T v)  {
      if (!hasVertex(v))
         return null;
      ArrayList<T> list = new ArrayList<T>();
      Vertex<T,N> temp = head;
      while (temp!=null)	{
         if ( temp.vertexInfo.compareTo( v ) == 0 )   {
            // Reached vertex, look for destination now
            Edge<T,N> currentEdge = temp.firstEdge;
            while (currentEdge != null) {
               list.add(currentEdge.toVertex.vertexInfo);
               currentEdge=currentEdge.nextEdge;
            }
         }
         temp=temp.nextVertex;
      }
      return list;   
   }
   
   public void printEdges()   {
      Vertex<T,N> temp=head;
      while (temp!=null) {
         System.out.print("# " + temp.vertexInfo + " : " );
         Edge<T,N> currentEdge = temp.firstEdge;
         while (currentEdge != null) {
            System.out.print("[" + temp.vertexInfo + "," + currentEdge.toVertex.vertexInfo +"] " );
            currentEdge=currentEdge.nextEdge;
         }
         System.out.println();
         temp=temp.nextVertex;
      }  
   }

}

