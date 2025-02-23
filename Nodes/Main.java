public class Main {
    public static void main(String[] args){
    //creating object of node class
    Node firstNode = new Node("First!");
    System.out.println(firstNode.next);
    Node secondNode = new Node("Second!");

    System.out.println(firstNode.data);
    System.out.println(firstNode.getNextNode(firstNode).data);
     System.out.println(firstNode.getNextNode(firstNode).next);
    }
}