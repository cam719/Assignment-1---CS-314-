
package a1;



public class Vector3D {
	double  x, y, z;
	
	public Vector3D(double inc_x, double inc_y, double inc_z)
	{
		x = inc_x;
		y = inc_y;
		z = inc_z;
	}

	 public boolean equals(Object obj) {
			
			if(this.x == ((Vector3D) obj).x && this.y == ((Vector3D) obj).y && this.z == ((Vector3D) obj).x)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}

}