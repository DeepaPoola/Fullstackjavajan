import React from 'react'

const FactorialEx = () => {
    const [count, setCount] = React.useState(0)
    const [number, setNumber] = React.useState(5);
    //fact(5);
    let resultValue = React.useMemo(() => { fact(number) }, [number])
    return (
        <div>
            <h1>Count:{count}</h1>
            <h4>Fact {number}: is {resultValue}</h4>
            <button onClick={() => { setCount(count + 1) }}>Counter</button>
            <button onClick={() => { setNumber(number + 1) }}> Incr Number </button>
        </div>
    )
}
const fact = (num) => {
    console.log("factorila Function executing!")
    let result = 1;
    for (let i = num; i >= 1; i--) {
        result = result * i;
    }
    console.log("Factorial ", result)
    return result

}

export default FactorialEx