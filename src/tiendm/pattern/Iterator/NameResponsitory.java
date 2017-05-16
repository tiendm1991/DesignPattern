package tiendm.pattern.Iterator;

public class NameResponsitory implements Container {
	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{
		int index = 0;
		@Override
		public boolean hasNext() {
			return index < names.length;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}
		
	}

}
