package utils.lang;

public abstract class StringUtils {
    
    /**
     * Method that does a null safe, and out of bound safe substring operation with the same logic as the original substring method
     * @param ref The string, can be a null object
     * @param beginIndex 0 based position
     * @param endIndex end index, it won't be taken in the substring
     * @return a null object if passed a null string, or a substring
     */
    public static String substring(String ref, int beginIndex, int endIndex) {
        if (ref == null)
            return null;    
            
        if ("".equals(ref))
            return "";

        if (beginIndex >= endIndex) 
            throw new IllegalArgumentException("beginIndex can't be greater or equal than endIndex");
        
        if (beginIndex < 0 || endIndex < 0) 
            throw new IllegalArgumentException("indexes can't be negative");

        if (beginIndex >= ref.length()) 
            return "";
        
        return ref.substring(beginIndex, endIndex > ref.length() ? ref.length() : endIndex);
    }

    /**
     * Method that does a substring operation based on the begin index and the amount of letters that one wants to be extracted
     * if the begin is negative, it the substring operation will start from the end to the begining
     * @param ref The string, can be a null object
     * @param beginIndex 0 based index or -1 to indicate to start from the end
     * @param length number of characters that need to be extracted, can be more than the length of the string
     * @return null if passed a null object or a string
     */
    public static String lenghtSubstring(String ref, int beginIndex, int length) {
        if (ref == null)
            return null;        

        if ("".equals(ref) || length == 0)
            return "";

        if (length < 0)
            throw new IllegalArgumentException("length can't be negative");
        
        int tmpBeginIndex;
        int tmpFinalIndex;

        if (beginIndex < 0) {
            tmpFinalIndex = ref.length() + beginIndex + 1; 
            if (tmpFinalIndex <= 0) 
                return "";
            
            tmpBeginIndex = tmpFinalIndex - length;
            tmpBeginIndex = tmpBeginIndex < 0 ? 0 : tmpBeginIndex;
        }
        else {
            tmpBeginIndex = beginIndex;
            tmpFinalIndex = beginIndex + length;
        }

        return substring(ref, tmpBeginIndex, tmpFinalIndex);
    } 
}
