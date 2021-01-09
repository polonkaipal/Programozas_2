using System.Collections.Generic;

namespace Product
{
    public static class LinqExtensions
    {
        public static int Product(this IEnumerable<int> ie)
        {
            int p = 1;
            foreach (var n in ie)
            {
                p *= n;
            }

            return p;
        }
    }
}