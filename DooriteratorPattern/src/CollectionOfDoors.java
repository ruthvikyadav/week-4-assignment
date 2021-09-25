
public class CollectionOfDoors implements Container {

	
	String doors[] = { "Paneled Door", "Dutch Door", "Glass Door" ,"Battened and Ledged Door","Wood Door"};

	@Override
	public Iterator getIterator() {

		return new CollectionOfDoorsIterator();
	}

	private class CollectionOfDoorsIterator implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < doors.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return doors[i++];
			}
			return null;
		}
	}

}
