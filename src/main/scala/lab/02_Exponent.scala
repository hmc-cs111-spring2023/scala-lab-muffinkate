
/** 
  * Computes n^e
  */
def expt(n: Int, e: Int): Int = 
  if e == 0 then 1
  else if e == 1 then n
  else n * expt(n, e-1)
