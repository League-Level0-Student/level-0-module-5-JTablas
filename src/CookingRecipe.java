import javax.swing.JOptionPane;

public class CookingRecipe {
	public static void main(String[] args) {
		int foop = JOptionPane.showConfirmDialog(null, "Do you want to eat food?");
		System.out.println(foop);
		if (foop == 0) {
			int food = JOptionPane.showOptionDialog(null, "What type of food do you want?", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Grilled Cheese sandwich", "Peanut butter jelly sandwich", "Bread" }, null);
			System.out.println(food);
			if (food == 0) {
				grilled();
			} else if (food == 1) {
				peanut();
			} else if (food == 2) {
				bread();
			}
		}
		if (foop == 1) {
			JOptionPane.showMessageDialog(null, "Why don't you want food? GET OUT!!!");
		}
	}

	static void grilled() {
		JOptionPane.showMessageDialog(null, "Need: 2 Bread, Cheese, heat");
		JOptionPane.showMessageDialog(null,
				"Heat up bread, add cheese while you heat up bread. Stop at toast. Grilled Cheese");
	}

	static void peanut() {
		JOptionPane.showMessageDialog(null, "Need: 2 Bread, Peanut butter, Jelly");
		JOptionPane.showMessageDialog(null,
				"(Optional: Toast bread) Apply peanut butter and jelly to bread. Peanut Butter Jelly sandwich");
	}

	static void bread() {
		JOptionPane.showMessageDialog(null, "Need: Bread");
		JOptionPane.showMessageDialog(null, "Eat Bread");
	}

}
