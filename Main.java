package Blockchain;
import java.util.ArrayList;

public class Main {
	ArrayList<Block> blockchain = new ArrayList<>();
	public static void main(String[]args) {
		String[] genesisTransactions = {"Valkyrie"};
		Block genesisBlock = new Block(0,genesisTransactions);
		
		System.out.println(genesisBlock.getBlockHash());
	}
}
