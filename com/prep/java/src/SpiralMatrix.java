public class SpiralMatrix {

	enum Direction {
		LEFT_RIGHT, TOP_DOWN, RIGHT_LEFT, BOTTOM_UP
	};

	public static void traverseMatrixInSpiral(char[][] matrix, int initialRow,
			int finalRow, int initialColumn, int finalColumn, int totalElems,
			int visited, Direction direction) {
		System.out.println("Num Elems: " + totalElems + " visited: " + visited);
		if (visited != totalElems) {
			int count = 0;
			switch (direction) {
			case LEFT_RIGHT:
				for (int col = initialColumn; col <= finalColumn; col++) {
					System.out.print(matrix[initialRow][col] + " ");
					count++;
				}
				traverseMatrixInSpiral(matrix, initialRow + 1, finalRow,
						initialColumn, finalColumn, totalElems,
						visited + count, Direction.TOP_DOWN);
				break;
			case TOP_DOWN:
				for (int row = initialRow; row <= finalRow; row++) {
					System.out.print(matrix[row][finalColumn] + " ");
					count++;
				}
				traverseMatrixInSpiral(matrix, initialRow, finalRow,
						initialColumn, finalColumn - 1, totalElems, visited
								+ count, Direction.RIGHT_LEFT);
				break;
			case RIGHT_LEFT:
				for (int col = finalColumn; col >= initialColumn; col--) {
					System.out.print(matrix[finalRow][col] + " ");
					count++;
				}
				traverseMatrixInSpiral(matrix, initialRow, finalRow - 1,
						initialColumn, finalColumn, totalElems,
						visited + count, Direction.BOTTOM_UP);
				break;
			case BOTTOM_UP:
				for (int row = finalRow; row >= initialRow; row--) {
					System.out.print(matrix[row][initialColumn] + " ");
					count++;
				}
				traverseMatrixInSpiral(matrix, initialRow, finalRow,
						initialColumn + 1, finalColumn, totalElems, visited
								+ count, Direction.LEFT_RIGHT);
				break;
			}
		}
	}

	/**
	 * Create the matrix and call the recursive call to traverse the matrix in
	 * spiral
	 */
	public static void main(String[] args) {
		char[][] matrix = new char[][] { { 'a', 'b', 'c' }, { 'h', 'i', 'd' },
				{ 'g', 'f', 'e' } };
		int lastRow = matrix.length - 1;
		int lastColumn = matrix[0].length - 1;
		int totalElems = matrix.length * matrix[0].length;

		traverseMatrixInSpiral(matrix, 0, lastRow, 0, lastColumn, totalElems,
				0, Direction.LEFT_RIGHT);
	}
}
