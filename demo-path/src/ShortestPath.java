public class ShortestPath {
    // A, B, 3
    // B, C, 4
    // A, Y, 2
    // Y, C, 2
    // A, I, 1
    // I, J, 1
    // J, C, 1

    // the shortest path between A and C is 2

    // No path is found
    public static void main(String[] args) {
        Path.addPath('A', 'B', 3);
        Path.addPath('B', 'C', 4);
        Path.addPath('A', 'Y', 2);
        Path.addPath('Y', 'C', 2);
        Path.addPath('A', 'I', 1);
        Path.addPath('I', 'J', 1);
        Path.addPath('J', 'C', 1);
        

        System.out.println(Path.findShortestPath('A', 'C'));
        
    }

    // A -> B = 3
    // B -> C = 7
    // A -> Y = 2
    // Y -> C = 4
    // A -> I = 1
    // I -> J = 2
    // J -> C = 3
    
}
