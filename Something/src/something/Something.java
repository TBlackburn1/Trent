
package something;

public class Something {

	int cadence;
	int speed;
	int gear;
	int upDown;
	String bikeName="unnamed";
	
	void bikeName(String name) {
		bikeName=name;
	}

	void initialize(int c, int s, int g) {
		cadence=c;
		speed=s;
		gear=g;
	}
	
	void changeCadence(int upDown) {
		cadence+=upDown;
		speed+=gear*upDown/5;
	}
	
	void changeGear(int upDown) {
		gear+=upDown;
		speed+=10*upDown;
		cadence-=5*upDown;
	}
	void changeSpeed(int upDown) {
		speed+=upDown;
		cadence+=5*upDown;
	}
	void applyBrakes(int upDown) {
		speed-=upDown;
	}
	void printStates() {
		System.out.println("Bike name: " + bikeName);
		System.out.println("cadence: " + cadence +
			" speed" + speed + " gear: " + gear + "\n");
		}
	}
