import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios'

export const client = axios.create({
        baseURL: 'http://localhost:8081',
        headers: {
          'Content-Type' : 'application/json'
        }
    })

const App = () => {

  const [data, setData] = useState(0);
  const [article, setArticle] = useState([]);

  const handleBtnClick = () => {
    setData(data+1);
    console.log(data);
  }

  useEffect(() => {
    const getData = async (url) => {
      try{
        const response = await client.get(url)
        console.log(response.data)
        setArticle(response.data)
      }catch(error){
        throw error
      }
    }
    getData('/api/article/all')
  },[])

  return (
    <div>
      <button className='border-solid border-black border-2 w-24 h-12'
      onClick={handleBtnClick}>
        값 올리기
      </button> 
      <h1>{data}</h1>
      <div>
        {article.map((data, idx) =>
          <div key={idx}>
            <h1>ID값: {data.id}</h1>
            <h1>제목: {data.title}</h1>
            <h1>내용: {data.content}</h1>
          </div>
        )}
      </div>
    </div>
  )
}

export default App
