


def tric (arr1,arr2) :
    arrt = [None] * (len (arr1) + len (arr2))
    k = 0
    i = 0
    j = 0
    while (k < len (arrt)) :
        if i < len (arr1) and j < len (arr2) :
            if arr1[i] <= arr2[j] :
                arrt[k] = arr1[i];i += 1
            else :
                arrt[k] = arr2[j];j += 1
        elif i < len (arr1) :
            arrt[k] = arr1[i];i += 1
        else :
            arrt[k] = arr2[j];j += 1
        k += 1
    return arrt



    
    


def trifusion (arr,low,high) :
    arrt = [None] * (high - low + 1)
    if low == high :
        arrt[0] = arr[low]
    else :
        arr1 = trifusion (arr,low,(high + low ) // 2)
        arr2 = trifusion (arr,(high + low) // 2 + 1,high)
        arrt = tric (arr1,arr2)
    return arrt


print(fusion ([2,3,1,14,7,82,23],0,6))